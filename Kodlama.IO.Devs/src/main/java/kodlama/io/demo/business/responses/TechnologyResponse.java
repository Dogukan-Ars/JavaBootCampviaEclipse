package kodlama.io.demo.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyResponse {
	private int id;
	private int programmingLanguageId;
	private String name;
}
