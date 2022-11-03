package kodlama.io.demo.business.abstracts;

import java.util.List;

import kodlama.io.demo.business.requests.TechnologyRequest;
import kodlama.io.demo.business.responses.TechnologyResponse;

public interface TechnologyService {
	List<TechnologyResponse> getAll();
	void add(TechnologyRequest technologyRequest);
	void update(TechnologyRequest technologyRequest, int id);
	void delete(int id);
}
