// package days07;
// cmd ����� ��Ű�� ���־ߵ�
// �ѱ� ���ڵ����ؼ� �ٸ��̸� ���� ANSI

public class ControllOpFor141 {

	public static void main(String[] args) {
		/**/
		// ���߹ݺ����� �̿��ؼ� 
		// ������ 2�ܺ��� 9�ܱ��� ����ϼ���
		// �Ѱ��� ���� ��µǴ� ������ �����̵� �����̵� �������
		int i, j;
		
		for(i = 1; i <=9; i++) {
			for(j = 2; j <= 5; j++) {
				System.out.printf("%d x %d = %2d ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for(i = 1; i <=9; i++) {
			for(j = 6; j <= 9; j++) {
				System.out.printf("%d x %d = %2d ", j, i, i*j);
			}
			System.out.println();
		}
		
		
		
		
	}

}
