package core;

import java.util.ArrayList;

import util.Util;

public class BlockChainStarter {

	public static void main(String[] args) {
		
		Block block1 = new Block(1, null, 0, new ArrayList());
		block1.mine();
		block1.getInformation();
		
		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
		block2.addTransaction(new Transaction("������", "�����", 1.5));
		block2.addTransaction(new Transaction("������", "�����", 0.8));
		block2.mine();
		block2.getInformation();
		
		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
		block3.addTransaction(new Transaction("������", "������", 8.2));
		block3.addTransaction(new Transaction("������", "������", 3.6));
		block3.mine();
		block3.getInformation();
		
		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
		block4.addTransaction(new Transaction("�ֵν�", "������", 1.2));
		block4.mine();
		block4.getInformation();
		
	}

}
