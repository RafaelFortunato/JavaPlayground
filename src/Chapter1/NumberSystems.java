package Chapter1;

import java.util.ArrayList;

public class NumberSystems {

    public static void main(String args[]) {
        NumberSystems ns = new NumberSystems();
        ns.octagonal();
        ns.hexadecimal();
        ns.binary();
    }

    // Base 8
    private void octagonal() {
        ArrayList x = new ArrayList<>();
        x.add(00);
        x.add(01);
        x.add(02);
        x.add(03);
        x.add(04);
        x.add(05);
        x.add(06);
        x.add(07);
        x.add(010);
        x.add(011);
        x.add(012);
        System.out.println("octagonal: " + x);
    }

    // Base 16
    private void hexadecimal() {
        ArrayList x = new ArrayList<>();
        x.add(0x0);
        x.add(0x1);
        x.add(0x2);
        x.add(0x3);
        x.add(0x4);
        x.add(0x5);
        x.add(0x6);
        x.add(0x7);
        x.add(0x8);
        x.add(0x9);
        x.add(0xA);
        x.add(0xB);
        x.add(0xC);
        x.add(0xD);
        x.add(0xE);
        x.add(0xF);
        x.add(0x10);
        System.out.println("hexadecimal: " + x);
    }

    // Base 2
    private void binary() {
        ArrayList x = new ArrayList<>();
        x.add(0b0);
        x.add(0b1);
        x.add(0b10);
        x.add(0b11);
        x.add(0b100);
        x.add(0b101);
        x.add(0b110);
        x.add(0b111);
        x.add(0b1000);
        x.add(0b1001);
        x.add(0b1010);
        x.add(0b1011);
        x.add(0b1100);
        System.out.println("binary: " + x);
    }
}
