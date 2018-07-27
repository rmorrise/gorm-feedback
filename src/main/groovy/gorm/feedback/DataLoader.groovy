package gorm.feedback

import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

import javax.inject.Singleton

@Singleton
class DataLoader implements ApplicationEventListener<ServerStartupEvent> {
    private ThingService thingService

    DataLoader(ThingService thingService) {
        this.thingService = thingService
    }

    @Override
    void onApplicationEvent(ServerStartupEvent event) {
        thingService.save(new Thing(name: 'Demo'))
    }
}