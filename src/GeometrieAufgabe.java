
/*
Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.

Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben.

Sowohl ein Rechteck als auch ein Kreis hat die x und y Koordinaten.

Sowohl ein Rechteck als auch ein Kreis hat eine Methode "bewegen",
mit der sich die Koordinaten ändern lassen.

Erzeugen Sie ein Rechteck 3 x 4 mit den Koordinaten (0, 0)
und geben Sie seine Koordinaten aus.
Bewegen Sie das Rechteck zu den Koordinaten (12, -7).
Geben Sie die aktuellen Koordinaten aus.

Erzeugen Sie einen Kreis mit dem Radius 4 mit den Koordinaten (0, 0)
und geben Sie seine Koordinaten aus.
Bewegen Sie den Kreis zu den Koordinaten (33, 1).
Geben Sie die aktuellen Koordinaten aus.

Optional: Geben Sie einen Kreis mit System.out.println aus.
Die dabei entstehende Ausgabe soll mitteilen,
dass es ein Kreis ist (den Radius-Wert auch bitte zeigen).
 */


class Formen{
        int x;
        int y;
        public int getX() {return x;}
        public int getY() {return y;}
        public void bewegen(int x, int y){
           System.out.println("Die aktuelle Koordinaten sind: (" + x + " , "+ y + ")");
       }
   }

    class Rechteck extends Formen{
       Rechteck(int x, int y, int breite, int hoehe){
           this.x=x;
           this.y=y;
       }
        int breite;
        int hoehe;
        public int getBreite(){return breite;}
        public void setBreite(int breite){this.breite=breite;}
        public int getHoehe(){return hoehe;}
        public void setHoehe(int hoehe){this.hoehe=hoehe;}
    }

    class Kreis extends Formen{

       Kreis(int x, int y, int radius){
           this.x=x;
           this.y=y;
           this.radius=radius;
       }
        int radius;
        public int getRadius(){return radius;}
        public void setRadius(int radius) {this.radius=radius;}

        public String toString(){
           return "Ein Kreis mit: " + radius + " radius. Koordinaten: (" + x +" , "+ y +")";
        }
    }

    public class GeometrieAufgabe {

    public static void main(String[] args) {
       Rechteck r= new Rechteck(0, 0, 3, 4);
       Kreis k= new Kreis(0,0, 4);
       System.out.println(k);
       r.bewegen(12, -7);
       k.bewegen(33,1);

    }
}
