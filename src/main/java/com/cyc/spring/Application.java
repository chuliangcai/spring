package com.cyc.spring;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ObjectMapper om = new ObjectMapper();
        JsonNode rootNode = om.readTree(new File("C:\\Users\\cyc\\Documents\\Tencent Files\\1169286799\\FileRecv\\MobileFile\\pca.json"));
        System.out.println(rootNode.toString());

        List<ProvinceNode> nodeList = convertNode(rootNode);
        System.out.println(nodeList);
    }

    private static List<ProvinceNode> convertNode(JsonNode rootNode) {
        List<ProvinceNode> nodeList = new ArrayList<>();
        Iterator<Map.Entry<String, JsonNode>> iterator = rootNode.fields();
        while (iterator.hasNext()) {
            Map.Entry<String, JsonNode> entry = iterator.next();
            ProvinceNode node = new ProvinceNode();
            node.setLabel(entry.getKey());
            node.setValue(entry.getKey());
            if (entry.getValue().isArray()) {
                List<ProvinceNode> qus=new ArrayList<>();
                Iterator<JsonNode> quIt = entry.getValue().elements();
                while (quIt.hasNext()){
                    JsonNode quNode= quIt.next();
                    ProvinceNode qu = new ProvinceNode();
                    qu.setLabel(quNode.toString());
                    qu.setValue(quNode.toString());
                    qu.setChildren(Collections.emptyList());
                    qus.add(qu);
                }
                node.setChildren(qus);

            } else {
                node.setChildren(convertNode(entry.getValue()));
            }
            nodeList.add(node);


        }
        return nodeList;
    }
}
