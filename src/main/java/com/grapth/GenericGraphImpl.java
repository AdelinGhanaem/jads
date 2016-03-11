package com.grapth;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 3/2/16.
 */
public class GenericGraphImpl implements GenericGraph<Integer> {


    private int edges;
    private int verticies;

    private Vertex<Integer> vVertexes[];


    public GenericGraphImpl(File file) {
        try {
            FileInputStream stream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            this.edges = Integer.valueOf(bufferedReader.readLine());
            this.verticies = Integer.valueOf(bufferedReader.readLine());
            this.vVertexes= (Vertex<Integer>[]) Array.newInstance(Vertex.class, verticies);
            for (int i = 0; i < vVertexes.length; i++) {
                vVertexes[i] = new Vertex<Integer>(i, new ArrayList<>());
            }
            String nextLine = bufferedReader.readLine();
            while (nextLine != null) {
                String[] strings= nextLine.split(" ");

                int first = Integer.valueOf(strings[0]);
                int second = Integer.valueOf(strings[1]);

                vVertexes[first].adj(vVertexes[second]);
                vVertexes[second].adj(vVertexes[first]);
                nextLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int sizeOfVertices() {
        return verticies;
    }

    @Override
    public int sizeOfEdges() {
        return edges;
    }


    @Override
    public void addEdge(Vertex<Integer> firstVertex, Vertex<Integer> secondVertex) {
        vVertexes[firstVertex.getValue()] = firstVertex;
        vVertexes[secondVertex.getValue()] = secondVertex;

        firstVertex.getAdjacents().add(secondVertex);
        secondVertex.getAdjacents().add(firstVertex);
    }

    @Override
    public List<Vertex<Integer>> getAdjacentTo(Vertex<Integer> vVertex) {
        return vVertexes[vVertex.getValue()].getAdjacents();
    }

    @Override
    public Vertex<Integer> getVertex(Integer value) {
        return vVertexes[value];
    }


}
