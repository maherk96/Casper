package rules;

import lombok.ToString;

@ToString
public class Root {
    public String sym;
    public int min;
    public int limit;
    public Minlimit minlimit;
    public Level level;
    public RuleSilver ruleSilver;
    public RuleGold ruleGold;

//    public Map<String, RuleSilver> ruleSilver;   <EUROPE, RulesSilver>
//    public Map<String, Map<String, RuleGold> ruleGold; <EUROPE, <CATA, RulesGold>
    
}
