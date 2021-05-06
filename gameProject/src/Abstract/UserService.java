package Abstract;

import java.util.Date;

public interface UserService {
	void register(User user);
	void update(User user,String nickname,String mail);
	void delete(User user);
}
