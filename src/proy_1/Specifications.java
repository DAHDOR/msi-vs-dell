package proy_1;

public class Specifications {
    int motherboards;
    int cpus;
    int rams;
    int powerSupplies;
    int graphicsCards;
    int computersBeforeGraphicsCard;
    int computerProfit;
    int computerWithGraphicsCardProfit;

    public Specifications(int motherboards, int cpus, int rams, int powerSupplies, int graphicsCards,
            int computersBeforeGraphicsCard, int computerProfit, int computerWithGraphicsCardProfit) {
        this.motherboards = motherboards;
        this.cpus = cpus;
        this.rams = rams;
        this.powerSupplies = powerSupplies;
        this.computersBeforeGraphicsCard = computersBeforeGraphicsCard;
        this.graphicsCards = graphicsCards;
        this.computerProfit = computerProfit;
        this.computerWithGraphicsCardProfit = computerWithGraphicsCardProfit;
    }
}
