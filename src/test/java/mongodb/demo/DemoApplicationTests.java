package mongodb.demo;

import lombok.extern.log4j.Log4j;
import mongodb.demo.entity.Mflix省内联网定点医疗机构和药店;
import mongodb.demo.repository.elasticsearch.Mflix省内联网定点医疗机构和药店ESRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j
public class DemoApplicationTests {

	@Autowired
	private Mflix省内联网定点医疗机构和药店ESRepository esRepository;

	@Test
	public void esSearch() {
		SearchQuery query = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.queryStringQuery("宁"))
				.withPageable(PageRequest.of(0,10))
				.build();
		Page<Mflix省内联网定点医疗机构和药店> page = esRepository.search(query);
		log.info(page);
	}
}
