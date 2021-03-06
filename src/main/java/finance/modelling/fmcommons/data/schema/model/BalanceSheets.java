package finance.modelling.fmcommons.data.schema.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("balance_sheets")
@SuperBuilder
@Data
public class BalanceSheets {

    private String symbol;
    private List<BalanceSheet> balanceSheets;
}
