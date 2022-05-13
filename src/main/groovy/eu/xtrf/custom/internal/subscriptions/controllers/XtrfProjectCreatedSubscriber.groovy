package eu.xtrf.custom.internal.subscriptions.controllers

import eu.xtrf.custom.internal.subscriptions.models.messages.pubsub.PubSubMessageWrapper
import eu.xtrf.custom.internal.subscriptions.models.messages.xtrf.XtrfEventWrapper
import eu.xtrf.custom.internal.subscriptions.models.messages.xtrf.events.XtrfProjectCreatedEvent
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import groovy.json.JsonSlurper

@Controller("/subscription")
class XtrfProjectCreatedSubscriber {

    JsonSlurper jsonSlurper = new JsonSlurper()


    @Post("/projectCreated")
    String processProjectCreatedEvent(@Body PubSubMessageWrapper pubSubMessageProjectCreated) {
        println("Got the message from PubSub")
        println("The message is $pubSubMessageProjectCreated")
        println("Unpacking that...")
        String messageAsString = new String(Base64.getDecoder().decode(pubSubMessageProjectCreated.message.getData()))
        println("Message as string $messageAsString")
        XtrfEventWrapper projectCreatedEvent = new XtrfEventWrapper(jsonSlurper.parseText(messageAsString) as Map)
        println("Here it is: ${projectCreatedEvent.data}")
        return ""

    }

}
