package ru.ezhov.lessons.homework.resolance.homework.HttpGet;

public class JsonClass {
    //String name;
    int id;
    double last;
    double lowerAsk;
    double highestBid;
    double percentChange;
    double baseVolume;
    double quoteVolume;
    int isFrozen;
    double high24hr;

    public JsonClass(String name, int id, double last, double lowerAsk, double highestBid, double percentChange, double baseVolume,
                     double quoteVolume, int isFrozen, double high24hr){
        //this.name = name;
        this.id = id;
        this.last =last;
        this.lowerAsk = lowerAsk;
        this.highestBid = highestBid;
        this.percentChange = percentChange;
        this.baseVolume = baseVolume;
        this.quoteVolume = quoteVolume;
        this.isFrozen = isFrozen;
        this.high24hr = high24hr;

    }

    /*@Override
    public String toString() {
        return "Name: " + name + "id: " + id;
    }*/
}
