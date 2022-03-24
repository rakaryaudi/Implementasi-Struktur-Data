package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueLL<Masukan> queue = new QueueLL<>();

        Scanner input = new Scanner(System.in);
        String tugas;
        boolean keluaran = true;
        while(keluaran){
            pilihan();
            switch (input.nextInt()){
                case 1:
                    System.out.println("Masukkan Tugas");
                    tugas = input.next();
                    queue.enqueue(new Masukan(tugas));
                    break;

                case 2:
                    queue.printQueue();
                    System.out.println();
                    break;

                case 3:
                    queue.dequeue();
                    queue.printQueue();
                    System.out.println();
                    break;

                default:
                    keluaran = false;
                    break;
            }
        }

    }
    public static void pilihan() {
        System.out.println("=== pilih menu ===");
        System.out.println("[1] Tambah Tugas");
        System.out.println("[2] Tugas Yang Harus Dikerjakan");
        System.out.println("[3] Hapus Tugas");
        System.out.println("[4] Keluar");
    }
}
