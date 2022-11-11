package lotto.controller;

import lotto.model.LottoMachine;
import lotto.model.Wallet;
import lotto.view.LottoInformationView;

public class LottoMachineController {
	private final LottoMachine lottoMachine;

	public LottoMachineController(int payMoney) {
		this.lottoMachine = new LottoMachine(payMoney);
	}

	public void viewLotto() {
		int purchaseCount = lottoMachine.getPurchaseAmount() / lottoMachine.LottoCost;
		new LottoInformationView(purchaseCount, lottoMachine.getLottoBundle());
	}

	public Wallet getWallet() {
		return  new Wallet(lottoMachine.getLottoBundle(), lottoMachine.LottoCost);
	}
}
