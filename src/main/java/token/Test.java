package token;

public class Test {
	public static void main(String[] args) {
        // �½�����¼�����߶���
        MemoRole role = new MemoRole(0,"�����", 1);
        // �½�����¼������
        MemoManager manager = new MemoManager();
        // ��ɫ��ʼ״̬
        System.out.println("������ʼ����:");
        role.getCurrentState();
        // ���ñ���¼ģʽ���浱ǰ״̬
        System.out.println("---���浱ǰ�Ļ���״̬---");
        manager.setMemoBean(role.CreateMemoObject());
        role.setDeviceName("�����");
        role.setStateLevel(5);
        role.setUseTime(1000);
        System.out.println("�Ѿ���������1000Сʱ");
        role.getCurrentState();
        // �ָ�����Ľ�ɫ״̬
        role.setMemento(manager.getMemoBean());
        System.out.println("�ָ��󷢵����ǰ״̬��");
        role.getCurrentState();
    }


}
