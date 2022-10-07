package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

//        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 7.6], faça:

//        List notas = new ArrayList<>();

//        List<Double> notas = new ArrayList<>();

//        ArrayList<Double> notas = new ArrayList<>();

//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 7.6));

//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 7.6);
//        notas.add(10d);
//        notas.remove(5d);
//        System.out.println(notas);

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 7.6); // ImmutableCollections
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);

        System.out.println("CRIE UMA LISTA E ADICIONE SETE NOTAS: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.9);
        notas.add(9.2);
        notas.add(8.0);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(6.9);
        notas.add(10.0);
//        System.out.println(notas.toString());


//        System.out.println("EXIBA A POSIÇÃO DA NOTA 5.0: " + notas.indexOf(5.0));
//
//        System.out.println("ADICIONE NA LISTA A NOTA 8.0 NA POSIÇÃO 4: \n");
//        notas.add(4, 8.0);
//        System.out.println(notas);
//
//        System.out.println("SUBSTITUA A NOTA 5.0 PELA NOTA 6.0");
//        notas.set(notas.indexOf(5.0), 6.0);
//        System.out.println(notas);
//
//        System.out.println("CONFIRA SE A NOTA 5.0 ESTÁ NA LISTA: " + notas.contains(5d));
//
//        System.out.println("EXIBA TODAS AS NOTAS NA ORDEM EM QUE FORAM INFORMADOS: ");
//        for (Double nota : notas){
//            System.out.println(nota);
//
//        }
//
//        System.out.println("EXIBA A TERCEIRA NOTA ADICIONADA: " + notas.get(2));
//
//        System.out.println("EXIBA A MENOR NOTA: " + Collections.min(notas));
//
//        System.out.println("EXIBA A MAIOR NOTA:  " + Collections.max(notas));

        System.out.println("EXIBA A SOMA DOS VALORES: ");
        var  iterator = notas.iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("EXIBA A MÉDIA DAS NOTAS: "+ (soma/notas.size()));

        System.out.println("REMOVA A NOTA 0: ");
        notas.remove(0.0);

        System.out.println("REMOVA A NOTA DA POSIÇÃO 0: ");
        notas.remove(0);

        System.out.println("REMOVA AS NOTAS MAIORES QUE 7 E EXIBA A LISTA:  ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("APAGUE TODA A LISTA: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("CONFIRA SE A LISTA ESTÁ VAZIA: ");
        System.out.println(notas.isEmpty());


//        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
//
//        System.out.println("Crie uma lista chamada notas2 " +
//                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
//
//        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
//
//        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");


    }


}

