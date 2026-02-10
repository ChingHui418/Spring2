package tw.hui.spring2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@Builder
@Data
public class User {
	private int id;
	private String name;
	private boolean gender;
}
