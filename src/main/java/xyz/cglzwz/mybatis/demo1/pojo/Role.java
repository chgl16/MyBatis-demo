package xyz.cglzwz.mybatis.demo1.pojo;

/**
 * @author chgl16
 * @Date 2018.9.26
 */
public class Role {
	
	private Long id;
	private String roleName;
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Role() {
		
	}
	public Role(Long id, String roleName, String note) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.note = note;
	}
	
	
}
