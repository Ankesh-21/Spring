import React from "react";

const Home = () => {
  const [tasks, setTasks] = React.useState([]);
  const [loading, setLoading] = React.useState(true);
  React.useEffect(() => {
    const fetchTasks = async () => {
      try {
        const res = await fetch("http://localhost:8080/api/tasks");
        const data = res.json();
        setTasks(data);
        setLoading(false);
      } catch (err) {
        console.log(err);
        setLoading(false);
      }
    };
    fetchTasks();
  },[]);
  if (loading) return <>Loading....</>
  return (
    <>
        <h1>This is Home Page</h1>
    </>
  )
};

export default Home;
