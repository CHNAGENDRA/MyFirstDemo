package info.nss.service;

public class GreetServiceImpl implements GreetService {

	@Override
	public String wishes(String name) {
		return "Hello"+name;
	}

}
