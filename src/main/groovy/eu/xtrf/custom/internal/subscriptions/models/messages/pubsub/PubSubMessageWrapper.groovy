package eu.xtrf.custom.internal.subscriptions.models.messages.pubsub

import groovy.transform.ToString

@ToString
class PubSubMessageWrapper {

    Message message

    @ToString
    class Message {
        String data
        String subcription
        String messageId
        String publishTime
    }
}
