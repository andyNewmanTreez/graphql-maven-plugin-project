/**
 * 
 */
package graphql.mavenplugin_notscannedbyspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.graphql_java_generator.plugin.conf.PluginMode;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import graphql.schema.GraphQLScalarType;

/**
 * The Spring configuration used for JUnit tests. In this one, no {@link GraphQLScalarType} : used to check that this
 * lack is properly handled.
 * 
 * @author etienne-sf
 */
@Configuration
@ComponentScan(basePackages = "com.graphql_java_generator", excludeFilters = {
		@Filter(type = FilterType.REGEX, pattern = ".*\\.GenerateRelaySchema.*"),
		@Filter(type = FilterType.REGEX, pattern = ".*\\.GenerateGraphQLSchema.*") })
public class AllGraphQLCases_Server_SpringConfiguration_KO extends AbstractSpringConfiguration {

	public AllGraphQLCases_Server_SpringConfiguration_KO() {
		super("allGraphQLCases*.graphqls", PluginMode.server, null, null, false);
	}
}
