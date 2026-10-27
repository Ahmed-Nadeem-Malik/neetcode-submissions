class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> prevMap;
        auto n{nums.size()};

        for (auto i{0uz}; i < n; i++) {
            int diff = target - nums[i];
            if (prevMap.find(diff) != prevMap.end()) return {prevMap[diff], static_cast<int>(i)};
            prevMap.insert({nums[i], static_cast<int>(i)});
        }

        return {};
    }
};