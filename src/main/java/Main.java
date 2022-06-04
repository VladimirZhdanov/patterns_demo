import com.homel.strategy.problem.enums.Type;
import com.homel.strategy.problem.model.Input;
import com.homel.strategy.problem.service.QueryBuilder;
import com.homel.strategy.problem.service.QueryBuilderImpl;

public class Main {
    public static void main(String[] args) {
        QueryBuilder queryBuilder = new QueryBuilderImpl();
        Input input = Input.builder()
                .type(Type.PNL)
                .name("mark 1")
                .build();

        // PROBLEM
        System.out.println(queryBuilder.buildQuery(input));

        // SOLUTION
        com.homel.strategy.solution.service.QueryBuilderImpl queryBuilderSolution = new com.homel.strategy.solution.service.QueryBuilderImpl();
        System.out.println(queryBuilderSolution.buildQuery(input));
    }
}
