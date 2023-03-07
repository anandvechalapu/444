
Controller Class:

@RestController
public class ForgetPasswordController {
 
    private final ForgetPasswordService forgetPasswordService;
 
    @Autowired
    public ForgetPasswordController(ForgetPasswordService forgetPasswordService) {
        this.forgetPasswordService = forgetPasswordService;
    }
 
    @PostMapping("/forget-password")
    public void sendForgetPasswordLink(@RequestBody ForgetPasswordRequest forgetPasswordRequest) {
        forgetPasswordService.sendForgetPasswordLink(forgetPasswordRequest);
    }
 
    @PostMapping("/reset-password")
    public void resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        forgetPasswordService.resetPassword(resetPasswordRequest);
    }
}

Service Class:

@Service
public class ForgetPasswordService {
 
    private final ForgetPasswordRepository forgetPasswordRepository;
 
    @Autowired
    public ForgetPasswordService(ForgetPasswordRepository forgetPasswordRepository) {
        this.forgetPasswordRepository = forgetPasswordRepository;
    }
 
    public void sendForgetPasswordLink(ForgetPasswordRequest forgetPasswordRequest) {
        // code to send forget password link
    }
 
    public void resetPassword(ResetPasswordRequest resetPasswordRequest) {
        // code to reset password
    }
}

Repository Class:

@Repository
public interface ForgetPasswordRepository extends JpaRepository<ForgetPassword, Long> {
 
    Optional<ForgetPassword> findByUserId(Long userId);
}