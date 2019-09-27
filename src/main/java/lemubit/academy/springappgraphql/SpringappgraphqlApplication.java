package lemubit.academy.springappgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *For Application.properties file
 *  graphql.servlet.mapping and graphiql.endpoint do need to match,
 *  as that is how GraphQL and GraphiQL will interact.
 * **/
@SpringBootApplication
public class SpringappgraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringappgraphqlApplication.class, args);
    }

}
