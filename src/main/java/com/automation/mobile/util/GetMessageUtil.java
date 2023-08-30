package com.automation.mobile.util;

import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @Author-Subhankar
 */
public class GetMessageUtil {
    private static Stream<Message> getMessages(String ACCOUNT_SID) {
        ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
        return StreamSupport.stream(messages.spliterator(), false);
    }

    public static String getMessage(String number, String ACCOUNT_SID) {
        return getMessages(ACCOUNT_SID).filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
                .filter(m -> m.getTo().equals(number)).map(Message::getBody).findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
