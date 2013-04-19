/**
 * 
 */
package com.alibaba.biz.notify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taobao.notify.message.Message;
import com.taobao.notify.message.StringMessage;
import com.taobao.notify.remotingclient.MessageListener;
import com.taobao.notify.remotingclient.MessageStatus;
import com.taobao.notify.remotingclient.NotifyManagerBean;
import com.taobao.notify.remotingclient.SendMessageCallback;
import com.taobao.notify.remotingclient.SendResult;

/**
 * @author wb-zhouxiang
 * 
 */
public class NotifySender implements MessageListener {

	private final String NOTIFY_TOPIC = "TOPIC-JU-ZX-TEST";
	private final String NOTIFY_MESSAGETYPE = "NM-JU-TEST-SUCCESS";

	private NotifyManagerBean notifyManager;

	public void setNotifyManager(NotifyManagerBean notifyManager) {
		this.notifyManager = notifyManager;
	}

	public void sendUntranMessage(String key, String value) {
		StringMessage msg = new StringMessage();
		msg.setTopic(NOTIFY_TOPIC);
		msg.setMessageType(NOTIFY_MESSAGETYPE);
		msg.setBody("TESTTEST");
		msg.setStringProperty(key, value);
		SendResult sendResult = notifyManager.sendMessage(msg);
		System.out.println(sendResult.isSuccess());
	}

	public void sendTranMessage(String key, String value) {
		StringMessage msg = new StringMessage();
		msg.setTopic(NOTIFY_TOPIC);
		msg.setMessageType(NOTIFY_MESSAGETYPE);
		msg.setBody("TESTTEST");
		msg.setStringProperty(key, value);
		SendResult sendResult = notifyManager.sendMessage(msg,
				new SendMessageCallback() {

					@Override
					public Object doInTransaction(MessageStatus status) {
						// TODO Auto-generated method stub
						System.out.println("callback");
						return null;
					}
				});

		System.out.println(sendResult.isSuccess());
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:/biz/biz-manager.xml");
		NotifySender ns = (NotifySender) ac.getBean("notifySender");
		ns.sendUntranMessage("TEST_KEY", "TEST_VALUE");
	}

	@Override
	public void receiveMessage(Message message, MessageStatus status) {
		System.out.println(message.getTopic());
		System.out.println(message.getMessageType());
		System.out.println(message.getBornTime());
		System.out.println(message.getProperties().get("TEST_KEY"));

	}
}
