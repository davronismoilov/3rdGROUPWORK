package uz.pdp.service;

import uz.pdp.model.Cafe;
import uz.pdp.model.HistoryUser;
import uz.pdp.model.User;
import uz.pdp.model.base.HistoryModel;
import uz.pdp.service.base.BaseService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HistoriesService implements BaseService<HistoryModel, List<HistoryModel>, User, Cafe> {
    private List<HistoryModel> histories = new ArrayList<>();

    @Override
    public void add(HistoryModel historyModel) {
        histories.add(historyModel);
    }

    @Override
    public int sendSMS() {
        return 0;
    }

    @Override
    public List<HistoryModel> getList(User user) {
        return null;
    }

    @Override
    public List<HistoryModel> getList() {
        return null;
    }

    @Override
    public boolean check(Cafe cafe) {
        return false;
    }

    @Override
    public HistoryModel get(Cafe cafe) {
        return null;
    }

    @Override
    public HistoryModel get(Cafe d1, Cafe d2) {
        return null;
    }

    public List<HistoryUser> getHistories(User user) {
        UUID userID = user.getId();
        List<HistoryUser> historyUsers = new ArrayList<>();
        for (HistoryModel historyModel : histories) {
            if (historyModel instanceof HistoryUser) {
                HistoryUser historyUser = (HistoryUser) historyModel;
                if (historyUser.getUserID().equals(userID)) {
                    historyUsers.add(historyUser);
                }
            }
        }
        return historyUsers;
    }
}
