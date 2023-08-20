package studi_kasus_2;

class Node {
    String nama;
    Node nextNode;
    Edge jalur;
}

class Edge {
    int cost;
    Node tujuan;
    Edge sibling;
}

class Graph {
    Node first;
}

public class MainProgram {
    public static void createGraph(Graph g) {
        g.first = null;
    }

    public static void createNode(Graph g, String nama) {
        Node temp;
        Node newNode = new Node();
        newNode.nama = nama;
        newNode.nextNode = null;
        newNode.jalur = null;

        if (g.first == null) {
            g.first = newNode;
        } else {
            temp = g.first;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    public static Node searchNode(String nama, Graph g) {
        int nilai;
        Node temp;
        temp = g.first;
        nilai = temp.nama.compareTo(nama);

        while (nilai != 0) {
            temp = temp.nextNode;
            nilai = temp.nama.compareTo(nama);
        }
        return temp;
    }

    public static void createEdge(String awal, String akhir, int nilaiJalur, Graph g) {
        Node asal = searchNode(awal, g);
        Node tujuan = searchNode(akhir, g);
        Edge temp = asal.jalur;
        Edge newEdge = new Edge();
        newEdge.tujuan = tujuan;
        newEdge.cost = nilaiJalur;
        newEdge.sibling = null;

        if (asal.jalur == null) {
            asal.jalur = newEdge;
        } else {
            while (temp.sibling != null) {
                temp = temp.sibling;
            }
            temp.sibling = newEdge;
        }
    }

    public static void cetak(Graph g) {
        Node tempNode = g.first;
        Edge tempEdge;

        if (tempNode != null) {
            while (tempNode != null) {
                System.out.println(tempNode.nama);
                tempEdge = tempNode.jalur;
                while (tempEdge != null) {
                    System.out.println(tempEdge.tujuan.nama + "\t: " + tempEdge.cost);
                    tempEdge = tempEdge.sibling;
                }
                System.out.println();
                tempNode = tempNode.nextNode;
            }
        } else {
            System.out.println("Simpul Kosong");
        }
    }

    public static void main(String[] args) {
        Graph pembelian = new Graph();

        System.out.println("----------Pembelian Produk Deep Neve Perhari----------\n");

        createGraph(pembelian);

        createNode(pembelian, "Bucket Hat");
        createNode(pembelian, "Trucker Hat");
        createNode(pembelian, "Baseball Cap");
        createNode(pembelian, "T-Shirt");
        createNode(pembelian, "Work Jacket");
        createNode(pembelian, "Sherpa Jacket");

        createEdge("Bucket Hat", "Trucker Hat", 6, pembelian);
        createEdge("Bucket Hat", "Baseball Cap", 8, pembelian);
        createEdge("Trucker Hat", "Baseball Cap", 3, pembelian);
        createEdge("Trucker Hat", "T-Shirt", 5, pembelian);
        createEdge("Baseball Cap", "Work Jacket", 10, pembelian);
        createEdge("T-Shirt", "Work Jacket", 4, pembelian);
        createEdge("T-Shirt", "Sherpa Jacket", 5, pembelian);
        createEdge("Work Jacket", "Sherpa Jacket", 7, pembelian);
        createEdge("Sherpa Jacket", "Bucket Hat", 2, pembelian);

        cetak(pembelian);
    }
}