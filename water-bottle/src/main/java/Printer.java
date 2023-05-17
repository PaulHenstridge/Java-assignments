public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

   public int getPaper(){return this.paper;}
   public int getToner(){return this.toner;}

    public void print(int pages, int copies) {
        int requiredSheets = pages * copies;
        if(paper >= requiredSheets && toner >= requiredSheets){
            paper -= requiredSheets;
            toner -= requiredSheets;
            System.out.println("printed "+ pages*copies + " sheets");
        } else {
            System.out.println("cannae dae it");
        }
    }
}
