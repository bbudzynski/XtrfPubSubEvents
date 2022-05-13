package eu.xtrf.custom.internal.subscriptions.models.messages.xtrf.events


import groovy.transform.MapConstructor
import groovy.transform.ToString

@ToString
@MapConstructor
class XtrfProjectCreatedEvent {
    String internalId
    String instructionsFromClient
    String specialisation
    ArrayList<String> categories
    String id
    String service
    String instructionsForVendor
    String clientPriceProfile
    String workflow
    String name
    String notes
    String client
    String startDateAndTime
    String projectCoordinator
    String projectManager
    String clientLegalName
    String createdOn
    boolean isClassic
}
