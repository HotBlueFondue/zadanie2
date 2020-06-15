
public class Ruch {
    Punkt p = new Punkt();
    Prostokat obszar = new Prostokat(500, 600);
    Aparat aparat = new Aparat();

    //cartesian sys. parma of starting point of vue
    int x = 0;
    int y = obszar.wysokosc;

    //direction flag
    boolean kierunek = true;

    //photo album
    int album = 1;

    public void ruch() {
        /*starting the movement settings. (the midle point of measure area
        will be us guide)*/
        p.setX(x += 20);
        p.setY(y -= 20);

        //make a 1st photo
        aparat.setKlisza(album);

        //down-move condition check
        while (y > 0) {
            if (x >= obszar.szerokosc - 20) {
                dol();
                kierunek = false;
            } else if (x <= 0) {
                dol();
                kierunek = true;
            }

            //right-left movement
            if (kierunek) prawo(); else lewo();

            //make a photo
            aparat.setKlisza(album++);
        }
    }

    //move methods
    public void prawo() {p.setX(x += 40);}
    public void lewo() {p.setX(x -= 40);}
    public void dol() {p.setY(y -= 40);}
}