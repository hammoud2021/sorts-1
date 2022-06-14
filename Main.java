import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
    
    //Selection Sort
    int[] elements = {21, 17, 60, 20, 56, 12};
    System.out.println("Printing Unsorted Array");
    for(int nums : elements)
      {
        System.out.print(nums + " ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      for(int nums : elements)
      {
        System.out.print(nums + " ");
      }
      System.out.println();
    }

    //Insertion Sort 
    int[] elements2 = {21, 17, 60, 20, 56, 12};
    System.out.println("\nPrinting Unsorted Array");
    for(int numi : elements2)
      {
        System.out.print(numi + " ");
      }
    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;

      for(int numi : elements2)
      {
        System.out.print(numi + " ");
      }
      System.out.println();
    }


    
    //Selection Sort 
    String[] wordsSelect = {"run" , "jump" , "eat" , "dream" , "drive"};
    System.out.println("\nPrinting Unsorted Array of Strings");
    for(String s : wordsSelect)
      {
        System.out.print(s + " ");
      }
    System.out.println("\nPrinting Each Pass of String Array Through the Selection Sort");
    for(int i = 0; i<wordsSelect.length - 1; i++)
    {
      int minIndex = i;
      for (int k = i + 1; k < wordsSelect.length; k++)
      {
        if (wordsSelect[k].compareTo(wordsSelect[minIndex]) < -1)
        {
          minIndex = k;
        }
      }
      String temp = wordsSelect[i];
      wordsSelect[i] = wordsSelect[minIndex];
      wordsSelect[minIndex] = temp;

      for(String s : wordsSelect)
      {
        System.out.print(s + " ");
      }
      System.out.println();
    }
    
    //Insertion Sort 
    String[] wordsInsert = {"run" , "jump" , "eat" , "dream" , "drive"};
    System.out.println("\nPrinting unsorted array of strings");
    for(String i : wordsInsert)
      {
        System.out.print(i + " ");
      }
    System.out.println("\nPrinting each pass of string array through the selection sort");
    for (int j = 1; j < wordsInsert.length; j++)
    {
      String temp = wordsInsert[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(wordsInsert[possibleIndex - 1]) < -1)
      {
        wordsInsert[possibleIndex] = wordsInsert[possibleIndex - 1];
        possibleIndex--;
      }
      wordsInsert[possibleIndex] = temp;

      for(String i : wordsInsert)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    

    //Selection Sort
    ArrayList <Integer> ialSel = new ArrayList<Integer>();
    ialSel.add(73);
    ialSel.add(12);
    ialSel.add(21);
    ialSel.add(29);
    ialSel.add(2);
    ialSel.add(19);
    System.out.println("\nPrinting Unsorted Integer ArrayList");
    System.out.println(ialSel);
    
    System.out.println("Printing each pass through selection sort");
    for (int j = 0; j < ialSel.size() - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < ialSel.size(); k++)
      {
        if (ialSel.get(k) < ialSel.get(minIndex))
        {
          minIndex = k;
        }
      }
      Integer temp = ialSel.get(j);
      ialSel.set(j, ialSel.get(minIndex));
      ialSel.set(minIndex, temp);
  
      System.out.println(ialSel);
    }
    
    //Insertion Sort 
    ArrayList <Integer> ialIns = new ArrayList<Integer>();
    ialIns.add(73);
    ialIns.add(12);
    ialIns.add(21);
    ialIns.add(29);
    ialIns.add(2);
    ialIns.add(19);
    System.out.println("\nPrinting Unsorted Integer ArrayList");
    System.out.println(ialIns);
    System.out.println("Printing Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements2.length; j++)
    {
      Integer temp = ialIns.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < ialIns.get(possibleIndex - 1))
      {
        ialIns.set(possibleIndex, ialIns.get(possibleIndex - 1));
        possibleIndex--;
        
      }
      ialIns.set(possibleIndex, temp);

      System.out.println(ialIns);
    }


    
    //Selection Sort 
    ArrayList<String> salSel = new ArrayList<String>();
    salSel.add("apple");
    salSel.add("banana");
    salSel.add("mango");
    salSel.add("orange");
    salSel.add("grape");
    System.out.println("\nPrinting Unsorted String ArrayList");
    System.out.println(salSel);
    System.out.println("Printing Each Pass of String Array List Through the Selection Sort");
    for(int i = 0; i<salSel.size() - 1; i++)
    {
      int minIndex = i;
      for (int k = i + 1; k < salSel.size(); k++)
      {
        if (salSel.get(k).compareTo(salSel.get(minIndex)) < -1)
        {
          minIndex = k;
        }
      }
      String temp = salSel.get(i);
      salSel.set(i, salSel.get(minIndex));
      salSel.set(minIndex, temp);

      System.out.println(salSel);
    }
    
    //Insertion Sort 
    ArrayList<String> salIns = new ArrayList<String>();
    salIns.add("apple");
    salIns.add("banana");
    salIns.add("mango");
    salIns.add("orange");
    salIns.add("grape");
    System.out.println("\nPrinting Unsorted String ArrayList");
    System.out.println(salIns);
    System.out.println("Printing Each Pass Through the Insertion Sort");
    for (int j = 1; j < salIns.size(); j++)
    {
      String temp = salIns.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(salIns.get(possibleIndex - 1)) < -1)
      {
        salIns.set(possibleIndex, salIns.get(possibleIndex - 1));
        possibleIndex--;
        
      }
      salIns.set(possibleIndex, temp);

      System.out.println(salIns);
    }
    
  }
}