class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> prevMap;

        for (auto i{0uz}; i < nums.size(); i++) {
            int diff = target - nums[i];
            if (prevMap.find(diff) != prevMap.end()) return {prevMap[diff], static_cast<int>(i)};
            prevMap.insert({nums[i], static_cast<int>(i)});
        }

        return {};
    }
};