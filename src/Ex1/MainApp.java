package Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class MainApp {
    public static void main(String[] args) throws IOException {
        List<Echipament> e = new ArrayList<Echipament>();
        String path = "D:\\Facultate\\Anul III\\Semestrul I\\PJ\\Laborator\\Lab4\\src\\Ex1\\electronice.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linie;
        while ((linie = br.readLine()) != null) {
            String[] s = linie.split(";");
            if (s[5].equals("imprimanta")) {
                Imprimanta i = new Imprimanta(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),
                        s[3], SituatieProdus.valueOf(s[4]), Integer.parseInt(s[6]), s[7], Integer.parseInt(s[8]), ModTipar.valueOf(s[9]));
                e.add(i);
            }
            if (s[5].equals("copiator")) {
                Copiator c = new Copiator(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), s[3], SituatieProdus.valueOf(s[4]),
                        Integer.parseInt(s[6]), FormatCopiere.valueOf(s[7]));
                e.add(c);
            }
            if(s[5].equals("sistem de calcul")) {
                SistemDeCalcul sc = new SistemDeCalcul(s[0],Integer.parseInt(s[1]),Integer.parseInt(s[2]),s[3],SituatieProdus.valueOf(s[4]),
                        s[6], Float.parseFloat(s[7]), Integer.parseInt(s[8]), SistemOperare.valueOf(s[9]));
                e.add(sc);
            }
        }

        do {
            System.out.println("1. Afişarea tuturor echipamentelor");
            System.out.println("2. Afişarea imprimantelor");
            System.out.println("3. Afişarea copiatoarelor");
            System.out.println("4. Afişarea sistemelor de calcul");
            System.out.println("5. Modificarea stării în care se află un echipament");
            System.out.println("6. Setarea unui anumit mod de scriere pentru o imprimantă");
            System.out.println("7. Setarea unui format de copiere pentru copiatoare");
            System.out.println("8. Instalarea unui anumit sistem de operare pe un sistem de calcul");
            System.out.println("9. Afişarea echipamentelor vândute");
            System.out.println("10. Să se realizeze două metode statice pentru serializarea / deserializarea colecției de obiecte în fișierul echip.bin");

            System.out.println("optiunea dvs este:");
            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt();
            switch (op)
            {
                case 0:
                    return;
                case 1:
                    unu(e);
                    break;
                case 2:
                    doi(e);
                    break;
                case 3:
                    trei(e);
                    break;
                case 4:
                    patru(e);
                    break;
                case 5:
                    cinci(e);
                    break;
                case 6:
                    sase(e);
                    break;
                case 7:
                    sapte(e);
                    break;
                case 8:
                    opt(e);
                    break;
                case 9:
                    noua(e);
                    break;
                case 10:
                    scrie(e, "src/Ex1/echip.bin");
                    List<Echipament> q;
                    q = (List<Echipament>) citeste("src/Ex1/echip.bin");
                    for(Echipament eq : q)
                        System.out.println(eq);
                    break;
            }
        }while(true);
    }

    public static void unu(List<Echipament> e)
    {
        for(Echipament x : e)
        {
            System.out.println(x.toString());
        }
    }
    public static void doi(List<Echipament> e)
    {
        for(Echipament x:e)
        {
            if(x instanceof Imprimanta)
            {
                System.out.println(x.toString());
            }
        }
    }
    public static void trei(List<Echipament> e)
    {
        for(Echipament x:e)
        {
            if(x instanceof Copiator)
            {
                System.out.println(x.toString());
            }
        }
    }
    public static void patru(List<Echipament> e)
    {
        for(Echipament x:e)
        {
            if(x instanceof SistemDeCalcul)
            {
                System.out.println(x.toString());
            }
        }
    }
    public static void cinci(List<Echipament> e)
    {
        System.out.println("dati nr echipamentului:");
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        System.out.println("dati starea de setat:");
        String sir = scanner.next();
        for(Echipament x:e) {
            if (x.getNr_inv()==cod) {
                x.setSp(SituatieProdus.valueOf(sir));
                System.out.println(x.toString());
            }
        }
    }
    public static void sase(List<Echipament> e)
    {
        System.out.println("dati nr echipamentului:");
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        System.out.println("dati modul de scriere de setat:");
        String sir = scanner.next();
        for(Echipament x:e) {
            if ((x instanceof Imprimanta) && x.getNr_inv()==cod) {
                ((Imprimanta) x).setMt(ModTipar.valueOf(sir));
                System.out.println(x.toString());
            }
        }
    }
    public static void sapte(List<Echipament> e)
    {
        System.out.println("dati nr echipamentului:");
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        System.out.println("dati formatul de copiere de setat:");
        String sir = scanner.next();
        for(Echipament x:e) {
            if ((x instanceof Copiator) && x.getNr_inv()==cod) {
                ((Copiator) x).setFormat(FormatCopiere.valueOf(sir));
                System.out.println(x.toString());
            }
        }
    }
    public static void opt(List<Echipament> e)
    {
        System.out.println("dati nr echipamentului:");
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        System.out.println("dati sistemul de operare de instalat:");
        String sir = scanner.next();
        for(Echipament x:e) {
            if ((x instanceof SistemDeCalcul) && x.getNr_inv()==cod) {
                ((SistemDeCalcul) x).setOS(SistemOperare.valueOf(sir));
                System.out.println(x.toString());
            }
        }
    }
    public static void noua(List<Echipament> e)
    {
        for(Echipament x:e) {
            if(x.getSp().equals(SituatieProdus.valueOf("vandut")))
                System.out.println(x.toString());
        }
    }
//    public static void zece(List<Echipament> e, String fis)
//    {
//
//        scrie(e,fis);
//    }
    static void scrie(Object o, String fis)
    {
        try
        {
            FileOutputStream f = new FileOutputStream(fis);
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(o);
            oos.close();
            f.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    static Object citeste(String fis)
    {
        try
        {
            FileInputStream f = new FileInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(f);
            Object o = ois.readObject();
            ois.close();
            f.close();
            return o;
        }
        catch (IOException|ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        return null;
    }
}
