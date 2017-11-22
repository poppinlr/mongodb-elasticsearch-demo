package mongodb.demo;

import mongodb.demo.repository.elasticsearch.ElasticSearchRepositoryTarget;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@EnableElasticsearchRepositories(basePackageClasses = ElasticSearchRepositoryTarget.class)
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
