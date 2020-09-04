package co.grandcircus.Famouslab;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FamousApi {

	RestTemplate rt;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Tiny> showTinyList() {
		String url="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		List<Tiny> tiny=rt.getForObject(url,Famous.class).getTiny();
		return tiny;
	}
	public List<Complete> showCompleteList() {
		String url="https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		List<Complete> complete=rt.getForObject(url,Famous.class).getComplete();
		return complete;
	}


}
