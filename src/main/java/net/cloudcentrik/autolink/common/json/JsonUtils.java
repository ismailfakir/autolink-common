package net.cloudcentrik.autolink.common.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.SneakyThrows;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JsonUtils {

    private ObjectMapper objectMapper;

    public JsonUtils(ObjectMapper objectMapper) {

        this.objectMapper = objectMapper;
        //this.objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    }

    public static JsonUtils createDefault() {
        return new JsonUtils(new ObjectMapper());
    }

    @SneakyThrows
    public String fromJson(JsonNode jsonNode) {
        return objectMapper.writeValueAsString(jsonNode);
    }

    @SneakyThrows
    public JsonNode toJson(String json) {
        return objectMapper.readTree(json);
    }

    public <T> JsonNode toJson(List<T> values) {

        return objectMapper.valueToTree(values);
    }

    @SneakyThrows
    public String asPrettyStr(JsonNode jsonNode) {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
    }

    @SneakyThrows
    public Map asMap(JsonNode jsonNode) {
        return objectMapper.treeToValue(jsonNode, Map.class);
    }

    @SneakyThrows
    public <T> T asObject(JsonNode jsonNode, Class<T> valueType) {
        return objectMapper.treeToValue(jsonNode, valueType);
    }

    public <T> Optional<T> getAsType(JsonNode parentNode, String path, Class<T> valueType) {
        JsonNode fieldNode = parentNode.at(path);
        if (fieldNode == null || fieldNode.isNull() || fieldNode.isMissingNode()) {
            // the field is either not present in parentNode, or explicitly set to null .
            return Optional.empty();
        } else {
            return Optional.of(asObject(fieldNode, valueType));
        }
    }

    public Optional<String> getAsStr(JsonNode parentNode, String path) {
       /* JsonNode fieldNode = parentNode.at(path);
        if(fieldNode == null || fieldNode.isNull()) {
            // the field is either not present in parentNode, or explicitly set to null .
            return Optional.empty();
        } else {
            return Optional.of(fieldNode.asText());
        }*/

        return getAsType(parentNode, path, String.class);
    }

    public Optional<Double> getAsDouble(JsonNode parentNode, String path) {
        return getAsType(parentNode, path, Double.class);
    }

    public Optional<Integer> getAsInt(JsonNode parentNode, String path) {
        return getAsType(parentNode, path, Integer.class);
    }

    public Optional<Long> getAsLong(JsonNode parentNode, String path) {
        return getAsType(parentNode, path, Long.class);
    }

    public Optional<Boolean> getAsBool(JsonNode parentNode, String path) {
        return getAsType(parentNode, path, Boolean.class);
    }

    public JsonNode createJson() {
        return objectMapper.createObjectNode().objectNode();
    }

    public JsonNode createJson(String key, String value) {
        ObjectNode objectNode = objectMapper.createObjectNode();
        return objectNode.put(key, value);
    }

    public <T> JsonNode createJsonArray(String key, List<T> values) {
        ObjectNode objectNode = objectMapper.createObjectNode();
        return objectNode.set(key, toJson(values));
    }

    public JsonNode addJsonNode(String key, JsonNode value, JsonNode parentNode) {
        ObjectNode objectNode = (ObjectNode) parentNode;
        return objectNode.set(key, value);
    }


    public static void traverse(JsonNode root) {

        if (root.isObject()) {
            Iterator<String> fieldNames = root.fieldNames();

            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                JsonNode fieldValue = root.get(fieldName);
                traverse(fieldValue);
            }
        } else if (root.isArray()) {
            ArrayNode arrayNode = (ArrayNode) root;
            for (int i = 0; i < arrayNode.size(); i++) {
                JsonNode arrayElement = arrayNode.get(i);
                traverse(arrayElement);
            }
        } else {
            // JsonNode root represents a single value field - do something with it.

        }
    }
}
