package de.thbin.epro.model;

public class Schemas {

    // optional
    /**
     * Schemas contains the schemas for an service instance and a service binding for one service plan.
     * @author Michael Kunz
     * */
    private ServiceInstanceSchema service_instance;
    private ServiceBindingSchema service_binding;

    // CONSTRUCTOR

    public Schemas(){
        service_instance = new ServiceInstanceSchema();
        service_binding = new ServiceBindingSchema();

    }

    // GETTER AND SETTER


    public ServiceInstanceSchema getService_instance() {
        return service_instance;
    }

    public void setService_instance(ServiceInstanceSchema service_instance) {
        this.service_instance = service_instance;
    }

    public ServiceBindingSchema getService_binding() {
        return service_binding;
    }

    public void setService_binding(ServiceBindingSchema service_binding) {
        this.service_binding = service_binding;
    }
}
