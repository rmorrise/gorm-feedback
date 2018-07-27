package gorm.feedback

import grails.gorm.services.Service

import javax.validation.Valid

@Service(Thing)
interface ThingService {
    List<Thing> findAll()
    Thing save(@Valid Thing thing)
}