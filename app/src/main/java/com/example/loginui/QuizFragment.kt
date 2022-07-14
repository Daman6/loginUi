package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.loginui.Adapter.*
import com.example.loginui.Model.PaperItemModel
import com.example.loginui.Model.QuestionModel
import com.example.loginui.Model.TestListModel
import com.example.loginui.Model.UserModel
import com.example.loginui.databinding.FragmentQuizBinding
import com.example.loginui.databinding.FragmentSignUpBinding
import com.example.loginui.databinding.ItemViewpagerBinding


class QuizFragment : Fragment() {

    lateinit var binding: FragmentQuizBinding
    lateinit var qlist: MutableList<QuestionModel>
    lateinit var toogle : ActionBarDrawerToggle

    lateinit var queslistAdapter: QuestionlistAdapter
    lateinit var qnolist: MutableList<Int>

    lateinit var paperItemAdapter: PaperItemAdapter
    lateinit var list: MutableList<PaperItemModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuizBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        qlist = mutableListOf<QuestionModel>()
//        qlist.add(QuestionModel("what is my name",4,1,"daman","baman","raman","chaman"))
//        qlist.add(QuestionModel("what is my name",4,2,"daman","baman","raman","chaman"))
//        qlist.add(QuestionModel("what is my name",4,3,"daman","baman","raman","chaman"))
//        qlist.add(QuestionModel("what is my name",4,4,"daman","baman","raman","chaman"))

        qnolist = mutableListOf<Int>()
        for (i in 1..30) {
            qnolist.add(i)
        }
//        binding.recyclerView.apply {
//            adapter = QuestionlistAdapter(qnolist)
//            layoutManager = GridLayoutManager(requireContext(),3)
//        }
        list = mutableListOf<PaperItemModel>()
        list.add(PaperItemModel("General Intelligence Practice Set","(Matriculation Level)","25 Ques.","17 min","50 Marks"))
        list.add(PaperItemModel("General Intelligence Practice Set","(Matriculation Level)","25 Ques.","17 min","50 Marks"))
        list.add(PaperItemModel("General Intelligence Practice Set","(Matriculation Level)","25 Ques.","17 min","50 Marks"))
        list.add(PaperItemModel("General Intelligence Practice Set","(Matriculation Level)","25 Ques.","17 min","50 Marks"))


//        var ad = ViewpagerAdapter(list)
//        binding.viewpager2.adapter = ad
//        binding.viewpager2.orientation =ViewPager2.ORIENTATION_HORIZONTAL

//
//        toogle = ActionBarDrawerToggle(requireActivity(),binding.drawerLayout,R.string.open,R.string.close)
//        binding.drawerLayout.addDrawerListener(toogle)
//        toogle.syncState()


        binding.recyclerView11.apply {
            adapter = PaperItemAdapter(list)
            layoutManager = LinearLayoutManager(requireContext())
        }



    }


}