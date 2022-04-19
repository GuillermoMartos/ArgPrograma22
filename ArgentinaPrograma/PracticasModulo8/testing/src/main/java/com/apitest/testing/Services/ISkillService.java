package com.apitest.testing.Services;

import java.util.List;


import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Skill;

public interface ISkillService {
    public void create_skill(Skill new_skill);
    public void update_skill(Skill skill);
    public void delete_skill(DeleterLong id_skill);
    public List<Skill> list_skill();
    public List<Skill> get_skill(Number id_user);
}
