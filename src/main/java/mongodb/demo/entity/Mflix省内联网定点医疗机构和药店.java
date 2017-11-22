package mongodb.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;


@Document(indexName = "mflix", type = "省内联网定点医疗机构和药店")
@Data
public class Mflix省内联网定点医疗机构和药店 {

    @Id
    private String _id;

    private String 所属医保中心;

    private String 网点名称;

    private String 所属地级市行政区划代码;

    private String 地址;

    private String 所属县区行政区划代码;

    private String 类别;

    private Integer 网点编号;

    @Field(pattern = "数据更新时间")
    private String updateTime1;

    @Field(searchAnalyzer = "数据更新时间")
    private String updateTime2;

    @Field(analyzer = "数据更新时间")
    private String updateTime3;

    @ScriptedField(name = "数据更新时间")
    private String updateTime4;

    @Mapping(mappingPath = "数据更新时间")
    private String updateTime5;
}
