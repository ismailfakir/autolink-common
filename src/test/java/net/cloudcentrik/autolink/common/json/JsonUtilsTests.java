package net.cloudcentrik.autolink.common.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.cloudcentrik.autolink.common.file.ResourceUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public class JsonUtilsTests {

    @Test
    public void testAsType() throws IOException {

        InputStream is = new ResourceUtils().getResourceAsIOStream("test/example_1.json");

        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonNode = mapper.readValue(is, JsonNode.class);

        JsonUtils jsonUtils = JsonUtils.createDefault();

        Optional<String> ans = jsonUtils.getAsStr(jsonNode,"/quiz/maths/q1/answer");

        Assertions.assertTrue(ans.isPresent());
        Assertions.assertEquals("12",ans.get());

        Optional<Double> point = jsonUtils.getAsDouble(jsonNode,"/quiz/maths/q1/point");

        Assertions.assertTrue(point.isPresent());
        Assertions.assertEquals(0.5,point.get());

    }

    @Test
    public void testJsonNode() throws IOException {
        JsonUtils jsonUtils = JsonUtils.createDefault();

        JsonNode emptyNode = jsonUtils.createJson();

        //System.out.println(jsonUtils.asPrettyStr(emptyNode));

        Assertions.assertEquals("{}",jsonUtils.fromJson(emptyNode));

        JsonNode testNode = jsonUtils.createJson("test",null);

        //System.out.println(jsonUtils.asPrettyStr(testNode));

        Assertions.assertTrue(jsonUtils.getAsStr(testNode,"/test").isEmpty());
        Assertions.assertTrue(jsonUtils.getAsStr(testNode,"/test/test").isEmpty());

        JsonNode newJsonNode = jsonUtils.addJsonNode("mypoint",jsonUtils.createJson("point", "none"),testNode);
        System.out.println(jsonUtils.asPrettyStr(newJsonNode));
        Assertions.assertTrue(jsonUtils.getAsStr(testNode,"/mypoint/point").isPresent());

        JsonNode arrayNode = jsonUtils.createJsonArray("key", List.of(1,2,3));
        System.out.println(jsonUtils.asPrettyStr(arrayNode));
        Assertions.assertTrue(arrayNode.get("key").isArray());
    }
}
