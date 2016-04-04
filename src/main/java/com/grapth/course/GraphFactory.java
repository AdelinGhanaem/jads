package com.grapth.course;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/24/16.
 */
public class GraphFactory {


    public static <T> Graph fromFile(String file) {
        if (file == null) throw new NullPointerException("argument is null");
        try (FileInputStream stream = new FileInputStream(new File(file))) {
            Scanner scanner;
            scanner = new Scanner(stream, "UTF-8");


            int v = Integer.valueOf(scanner.nextLine());
            int e = Integer.valueOf(scanner.nextLine());

            Map<Vertex<Integer>, List<Vertex<Integer>>> map = new HashMap<>();


            while (scanner.hasNext()) {

                int vertex = scanner.nextInt();

                Vertex<Integer> integerVertex = new Vertex<>(vertex);

                List<Vertex<Integer>> vertexes = map.get(integerVertex);
                if (vertexes == null) {
                    vertexes = new ArrayList<>();
                    vertexes.add(new Vertex<>(scanner.nextInt()));
                } else {
                    vertexes.add(new Vertex<>(scanner.nextInt()));
                }

                map.put(integerVertex, vertexes);

                scanner.nextLine();

                return new GenerigUndirectedGraph();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
        return null;
    }
}
