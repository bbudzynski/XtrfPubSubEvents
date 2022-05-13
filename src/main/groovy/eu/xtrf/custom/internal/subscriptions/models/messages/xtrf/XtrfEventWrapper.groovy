package eu.xtrf.custom.internal.subscriptions.models.messages.xtrf

import eu.xtrf.custom.internal.subscriptions.models.messages.xtrf.events.XtrfProjectCreatedEvent
import groovy.transform.MapConstructor
import groovy.transform.ToString

@ToString
@MapConstructor
class XtrfEventWrapper {
    String origin
    String originUuid
    XtrfProjectCreatedEvent data
}
