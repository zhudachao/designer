package token;

public class MemoRole {
	
	private int useTime;
	
	private String deviceName;
	
	private int stateLevel;

	public MemoRole(int useTime, String deviceName, int stateLevel) {
		super();
		this.useTime = useTime;
		this.deviceName = deviceName;
		this.stateLevel = stateLevel;
	}

	public MemoRole() {
		super();
	}

	public int getUseTime() {
		return useTime;
	}

	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getStateLevel() {
		return stateLevel;
	}

	public void setStateLevel(int stateLevel) {
		this.stateLevel = stateLevel;
	}
	
	public MemoBean CreateMemoObject(){
		    MemoBean memento = new MemoBean();
	        memento.setDeviceName(deviceName);
	        memento.setStateLevel(stateLevel);
	        memento.setUseTime(useTime);
	        return memento;

	}

	  public void setMemento(MemoBean memento) {
	        this.deviceName = memento.getDeviceName();
	        this.stateLevel = memento.getStateLevel();
	        this.useTime = memento.getUseTime();
	    }

	  public void getCurrentState() {
	        System.out.println("��ǰ�豸���ƣ�" + this.deviceName + "��ǰʹ��ʱ�䣺" + this.useTime + "��ǰ����״̬��" + this.stateLevel);
	    }

}
