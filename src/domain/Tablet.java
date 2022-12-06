package domain;

public class Tablet extends Product {

    private String producer;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void process() {
        System.out.println("Processing the tablet '" + getName() + "...'");
    }
}
