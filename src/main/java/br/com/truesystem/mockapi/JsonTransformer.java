/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.truesystem.mockapi;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.databind.type.CollectionType;
//import java.io.IOException;
//import java.util.Collections;
//import java.util.List;
//import java.util.Objects;
//import spark.ResponseTransformer;

/**
 *
 * @author gilmario
 */
public class JsonTransformer {

//    private final ObjectMapper objectMapper;
//
//    public JsonTransformer() {
//        objectMapper = new ObjectMapper();
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//    }
//
//    public <T> List<T> fromJsonList(String json, Class<T> classe) throws IOException {
//        if (Objects.isNull(json) || "".equals(json)) {
//            return Collections.EMPTY_LIST;
//        }
//        CollectionType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, classe);
//        return objectMapper.readValue(json, javaType);
//    }
//
//    public <T> T fromJson(String json, Class<T> classe) throws IOException {
//        if (Objects.isNull(json) || "".equals(json)) {
//            return null;
//        }
//        return objectMapper.readValue(json, classe);
//    }
//
//    public String toJson(Object o) throws IOException {
//        String dados = objectMapper.writeValueAsString(o);
//        return dados;
//    }
//
//    @Override
//    public String render(Object model) throws IOException {
//        return this.toJson(model);
//    }
}
